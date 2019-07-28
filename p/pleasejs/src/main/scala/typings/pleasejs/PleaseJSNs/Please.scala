package typings.pleasejs.PleaseJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Please extends js.Object {
  /***
    * convert HEX into HSV
    * @param {string} hex
    * @returns {HSV}
    */
  def HEX_to_HSV(hex: String): HSV = js.native
  /***
    * convert HEX into RGB
    * @param {string} hex
    * @returns {RGB}
    */
  def HEX_to_RGB(hex: String): RGB | Null = js.native
  /***
    * convert HSV into HEX
    * @param {HSV} hsv
    * @returns {string}
    */
  def HSV_to_HEX(hsv: HSV): String = js.native
  /***
    * convert HSV into RGB
    * @param {HSV} hsv
    * @returns {RGB}
    */
  def HSV_to_RGB(hsv: HSV): RGB = js.native
  /***
    * convert color name into hex string
    * @param {string} name
    * @returns {string}
    */
  def NAME_to_HEX(name: String): js.UndefOr[String] = js.native
  /***
    * convert color name into RGB
    * @param {string} name
    * @returns {HSV}
    */
  def NAME_to_HSV(name: String): HSV = js.native
  /***
    * convert color name into RGB
    * @param {string} name
    * @returns {RGB}
    */
  def NAME_to_RGB(name: String): RGB | Null = js.native
  /***
    * convert RGB into HEX
    * @param {RGB} rgb
    * @returns {string}
    */
  def RGB_to_HEX(rgb: RGB): String = js.native
  /***
    * convert RGB into HSV
    * @param {RGB} rgb
    * @returns {HSV}
    */
  def RGB_to_HSV(rgb: RGB): HSV = js.native
  /***
    * generate and return a random hex string
    * @param {MakeColorOption} options
    * @returns {Array}
    */
  def make_color(): js.Array[String | RGB | HSV] = js.native
  def make_color(options: MakeColorOption): js.Array[String | RGB | HSV] = js.native
  /***
    * make a color scheme
    * @param {MakeSchemeOption} options
    * @returns {Array}
    */
  def make_scheme(base_color: HSV): js.Array[String | RGB | HSV] = js.native
  def make_scheme(base_color: HSV, options: MakeSchemeOption): js.Array[String | RGB | HSV] = js.native
}

