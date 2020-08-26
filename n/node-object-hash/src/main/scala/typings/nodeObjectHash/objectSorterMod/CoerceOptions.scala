package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced coerce options
  */
@js.native
trait CoerceOptions extends js.Object {
  /**
    * If `true` converts booleans to string `1` and `0`
    * @example
    * // coerce.boolean = true
    * true === 1;
    * false === '0';
    * @example
    * // coerce.boolean = true
    * true !== 1;
    * false !== '0'
    * @default true
    */
  var boolean: js.UndefOr[Boolean] = js.native
  /**
    * If `true` dates may equal the same formatted strings
    * @example
    * // coerce.date = true
    * @example
    * // coerce.date = false
    * @default true
    */
  var date: js.UndefOr[Boolean] = js.native
  /**
    * If `true` functions may equal the same formatted strings
    * @example
    * // coerce.function = true
    * @example
    * // coerce.function = false
    * @default true
    */
  var function: js.UndefOr[Boolean] = js.native
  /**
    * If `true` null will be equal to empty string
    * @example
    * // coerce.null = true
    * null === ''
    * @example
    * // coerce.null = false
    * null !== ''
    * @default true
    */
  var `null`: js.UndefOr[Boolean] = js.native
  /**
    * If `true` converts numbers to strings
    * @example
    * // coerce.number = true
    * 1 === '1';
    * @example
    * // coerce.number = true
    * 1 !== '1';
    * @default true
    */
  var number: js.UndefOr[Boolean] = js.native
  /**
    * If `true` set will be coerced to array
    * @example
    * // coerce.set = true
    * @example
    * // coerce.set = false
    * @default true
    */
  var set: js.UndefOr[Boolean] = js.native
  /**
    * If `true` strings and coerced string will be equal to coerced numbers, booleans, etc
    * @example
    * // coerce.string = true
    * '1' === true
    * @example
    * // coerce.string = false
    * '1' !== 1
    * @default true
    */
  var string: js.UndefOr[Boolean] = js.native
  /**
    * If `true` all symbols will have eual representation
    * @example
    * // coerce.symbol = true
    * Symbol.for('a') === Symbol.for('b')
    * @example
    * // coerce.symbol = false
    * Symbol.for('a') !== Symbol.for('b')
    * @default true
    */
  var symbol: js.UndefOr[Boolean] = js.native
  /**
    * If `true` undefined will be equal to empty string
    * @example
    * // coerce.undefined = true
    * undefined === ''
    * @example
    * // coerce.undefined = false
    * undefined !== ''
    * @default true
    */
  var undefined: js.UndefOr[Boolean] = js.native
}

object CoerceOptions {
  @scala.inline
  def apply(): CoerceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoerceOptions]
  }
  @scala.inline
  implicit class CoerceOptionsOps[Self <: CoerceOptions] (val x: Self) extends AnyVal {
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
    def setBoolean(value: Boolean): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setDate(value: Boolean): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFunction(value: Boolean): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setNull(value: Boolean): Self = this.set("null", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNull: Self = this.set("null", js.undefined)
    @scala.inline
    def setNumber(value: Boolean): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setSet(value: Boolean): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setString(value: Boolean): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setSymbol(value: Boolean): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setUndefined(value: Boolean): Self = this.set("undefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndefined: Self = this.set("undefined", js.undefined)
  }
  
}

