package typings
package osmosisLib.osmosisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Osmosis extends js.Object {
  /**
       * Set configuration options for the **preceeding** command on down the chain.
       */
  def config(option: ScalablyTyped.runtime.StringDictionary[js.Any]): Osmosis = js.native
  /**
       * Set configuration options for the **preceeding** command on down the chain.
       */
  def config(option: ScalablyTyped.runtime.StringDictionary[js.Any], value: js.Any): Osmosis = js.native
  /**
       * Set configuration options for the **preceeding** command on down the chain.
       */
  def config(option: java.lang.String): Osmosis = js.native
  /**
       * Set configuration options for the **preceeding** command on down the chain.
       */
  def config(option: java.lang.String, value: js.Any): Osmosis = js.native
  /**
       * Set a cookie. Short for `.config({ cookies: ... })`. Note: Setting a cookie to `null` will delete the cookie.
       */
  def cookie(name: java.lang.String): Osmosis = js.native
  /**
       * Set a cookie. Short for `.config({ cookies: ... })`. Note: Setting a cookie to `null` will delete the cookie.
       */
  def cookie(name: java.lang.String, value: java.lang.String): Osmosis = js.native
  /**
       * passing string to your function
       * result data, osmosis finished
       */
  def data(callback: js.Function1[/* param */ js.Any, _]): Osmosis = js.native
  /**
       * passing string to your function
       * debug data
       */
  def debug(callback: js.Function1[/* param */ java.lang.String, _]): Osmosis = js.native
  /**
       * Call a callback when the Osmosis instance has completely finished.
       */
  def done(callback: js.Function0[_]): Osmosis = js.native
  /**
       * passing string to your function
       * error data
       */
  def error(callback: js.Function1[/* param */ java.lang.String, _]): Osmosis = js.native
  /**
       * find DOM by selector
       */
  def find(selector: java.lang.String): Osmosis = js.native
  /**
       * follw links, founded href or src
       * @param selector '@href' or '@src', default '@href'
       */
  def follow(selector: java.lang.String): Osmosis = js.native
  /**
       * define domain where osmosis is parsing data from
       */
  def get(url: java.lang.String): Osmosis = js.native
  /**
       * Set an HTTP header. Short for `.config({ headers: ... })`
       */
  def header(name: java.lang.String, value: java.lang.String): Osmosis = js.native
  /**
       * Set multiple HTTP headers. Short for `.config({ headers: ... })`.
       */
  def headers(headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]): Osmosis = js.native
  /**
       * passing string to your function
       * log data
       */
  def log(callback: js.Function1[/* param */ java.lang.String, _]): Osmosis = js.native
  /**
       * paginate followed url
       */
  def paginate(selector: java.lang.String): Osmosis = js.native
  /**
       * set scrapped data as result,
       * 1. string, after find function set data by selector as value with this string as key
       * 2. object, define any json object
       */
  def set(json: java.lang.String): Osmosis = js.native
  /**
       * set scrapped data as result,
       * 1. string, after find function set data by selector as value with this string as key
       * 2. object, define any json object
       */
  def set(json: js.Object): Osmosis = js.native
}

