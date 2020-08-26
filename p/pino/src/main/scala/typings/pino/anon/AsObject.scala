package typings.pino.anon

import typings.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  /**
    * The `asObject` option will create a pino-like log object instead of passing all arguments to a console
    * method. When `write` is set, `asObject` will always be true.
    *
    * @example
    * pino.info('hi') // creates and logs {msg: 'hi', level: 30, time: <ts>}
    */
  var asObject: js.UndefOr[Boolean] = js.native
  /**
    * The serializers provided to `pino` are ignored by default in the browser, including the standard
    * serializers provided with Pino. Since the default destination for log messages is the console, values
    * such as `Error` objects are enhanced for inspection, which they otherwise wouldn't be if the Error
    * serializer was enabled. We can turn all serializers on or we can selectively enable them via an array.
    *
    * When `serialize` is `true` the standard error serializer is also enabled (see
    * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#pino-stdserializers}). This is a global
    * serializer which will apply to any `Error` objects passed to the logger methods.
    *
    * If `serialize` is an array the standard error serializer is also automatically enabled, it can be
    * explicitly disabled by including a string in the serialize array: `!stdSerializers.err` (see example).
    *
    * The `serialize` array also applies to any child logger serializers (see
    * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#bindingsserializers-object} for how to
    * set child-bound serializers).
    *
    * Unlike server pino the serializers apply to every object passed to the logger method, if the `asObject`
    * option is `true`, this results in the serializers applying to the first object (as in server pino).
    *
    * For more info on serializers see
    * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#serializers-object}.
    *
    * @example
    * const pino = require('pino')({
    *   browser: {
    *     serialize: true
    *   }
    * })
    *
    * @example
    * const pino = require('pino')({
    *   serializers: {
    *     custom: myCustomSerializer,
    *     another: anotherSerializer
    *   },
    *   browser: {
    *     serialize: ['custom']
    *   }
    * })
    * // following will apply myCustomSerializer to the custom property,
    * // but will not apply anotherSerializer to another key
    * pino.info({custom: 'a', another: 'b'})
    *
    * @example
    * const pino = require('pino')({
    *   serializers: {
    *     custom: myCustomSerializer,
    *     another: anotherSerializer
    *   },
    *   browser: {
    *     serialize: ['!stdSerializers.err', 'custom'] //will not serialize Errors, will serialize `custom` keys
    *   }
    * })
    */
  var serialize: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Options for transmission of logs.
    *
    * @example
    * const pino = require('pino')({
    *   browser: {
    *     transmit: {
    *       level: 'warn',
    *       send: function (level, logEvent) {
    *         if (level === 'warn') {
    *           // maybe send the logEvent to a separate endpoint
    *           // or maybe analyse the messages further before sending
    *         }
    *         // we could also use the `logEvent.level.value` property to determine
    *         // numerical value
    *         if (logEvent.level.value >= 50) { // covers error and fatal
    *
    *           // send the logEvent somewhere
    *         }
    *       }
    *     }
    *   }
    * })
    */
  var transmit: js.UndefOr[Level] = js.native
  /**
    * Instead of passing log messages to `console.log` they can be passed to a supplied function. If `write` is
    * set to a single function, all logging objects are passed to this function. If `write` is an object, it
    * can have methods that correspond to the levels. When a message is logged at a given level, the
    * corresponding method is called. If a method isn't present, the logging falls back to using the `console`.
    *
    * @example
    * const pino = require('pino')({
    *   browser: {
    *     write: (o) => {
    *       // do something with o
    *     }
    *   }
    * })
    *
    * @example
    * const pino = require('pino')({
    *   browser: {
    *     write: {
    *       info: function (o) {
    *         //process info log object
    *       },
    *       error: function (o) {
    *         //process error log object
    *       }
    *     }
    *   }
    * })
    */
  var write: js.UndefOr[WriteFn | DictlogLevel] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsObject(value: Boolean): Self = this.set("asObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsObject: Self = this.set("asObject", js.undefined)
    @scala.inline
    def setSerializeVarargs(value: String*): Self = this.set("serialize", js.Array(value :_*))
    @scala.inline
    def setSerialize(value: Boolean | js.Array[String]): Self = this.set("serialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setTransmit(value: Level): Self = this.set("transmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransmit: Self = this.set("transmit", js.undefined)
    @scala.inline
    def setWriteFunction1(value: /* o */ js.Object => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: WriteFn | DictlogLevel): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

