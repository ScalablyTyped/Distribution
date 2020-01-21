package typings.pkijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "stringPrep")
@js.native
object stringPrep extends js.Object {
  /**
    * String preparation function. In a future here will be realization of algorithm from RFC4518
    * 
    * @param {string} inputString JavaScript string. As soon as for each ASN.1 string type we have a specific transformation function here we will work with pure JavaScript string
    * @returns {string} Formated string
    */
  def apply(inputString: String): String = js.native
}

