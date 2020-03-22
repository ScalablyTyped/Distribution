package typings.pino

import typings.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsObject extends js.Object {
  /**
    * The `asObject` option will create a pino-like log object instead of passing all arguments to a console
    * method. When `write` is set, `asObject` will always be true.
    *
    * @example
    * pino.info('hi') // creates and logs {msg: 'hi', level: 30, time: <ts>}
    */
  var asObject: js.UndefOr[Boolean] = js.undefined
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
  var serialize: js.UndefOr[Boolean | js.Array[String]] = js.undefined
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
  var transmit: js.UndefOr[AnonLevel] = js.undefined
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
  var write: js.UndefOr[WriteFn | AnonDictlogLevel] = js.undefined
}

object AnonAsObject {
  @scala.inline
  def apply(
    asObject: js.UndefOr[Boolean] = js.undefined,
    serialize: Boolean | js.Array[String] = null,
    transmit: AnonLevel = null,
    write: WriteFn | AnonDictlogLevel = null
  ): AnonAsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asObject)) __obj.updateDynamic("asObject")(asObject.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (transmit != null) __obj.updateDynamic("transmit")(transmit.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsObject]
  }
}

