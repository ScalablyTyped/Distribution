package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced coerce options
  */
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
  var boolean: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` dates may equal the same formatted strings
    * @example
    * // coerce.date = true
    * @example
    * // coerce.date = false
    * @default true
    */
  var date: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` functions may equal the same formatted strings
    * @example
    * // coerce.function = true
    * @example
    * // coerce.function = false
    * @default true
    */
  var function: js.UndefOr[Boolean] = js.undefined
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
  var `null`: js.UndefOr[Boolean] = js.undefined
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
  var number: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` set will be coerced to array
    * @example
    * // coerce.set = true
    * @example
    * // coerce.set = false
    * @default true
    */
  var set: js.UndefOr[Boolean] = js.undefined
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
  var string: js.UndefOr[Boolean] = js.undefined
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
  var symbol: js.UndefOr[Boolean] = js.undefined
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
  var undefined: js.UndefOr[Boolean] = js.undefined
}

object CoerceOptions {
  @scala.inline
  def apply(
    boolean: js.UndefOr[Boolean] = js.undefined,
    date: js.UndefOr[Boolean] = js.undefined,
    function: js.UndefOr[Boolean] = js.undefined,
    `null`: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Boolean] = js.undefined,
    set: js.UndefOr[Boolean] = js.undefined,
    string: js.UndefOr[Boolean] = js.undefined,
    symbol: js.UndefOr[Boolean] = js.undefined,
    undefined: js.UndefOr[Boolean] = js.undefined
  ): CoerceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(function)) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(`null`)) __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (!js.isUndefined(symbol)) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceOptions]
  }
}

