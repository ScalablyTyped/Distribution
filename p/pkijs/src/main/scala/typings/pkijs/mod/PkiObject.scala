package typings.pkijs.mod

import typings.pkijs.pkijsStrings.base64
import typings.pkijs.pkijsStrings.base64url
import typings.pkijs.pkijsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkiObject extends StObject {
  
  def className: String = js.native
  
  /**
    * Converts parsed ASN.1 object into current class
    * @param schema ASN.1 schema
    */
  def fromSchema(schema: SchemaType): Unit = js.native
  
  /**
    * Converts the class to JSON object
    * @returns JSON object
    */
  def toJSON(): Any = js.native
  
  /**
    * Converts current object to ASN.1 object and sets correct values
    * @param encodeFlag If param equal to `false` then creates schema via decoding stored value. In other case creates schema via assembling from cached parts
    * @returns ASN.1 object
    */
  def toSchema(): SchemaType = js.native
  def toSchema(encodeFlag: Boolean): SchemaType = js.native
  
  def toString(encoding: hex | base64 | base64url): String = js.native
}
