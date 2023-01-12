package typings.pg.mod

import typings.node.bufferMod.global.Buffer
import typings.pg.anon.FnCall
import typings.pg.pgStrings.binary
import typings.pg.pgStrings.text
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypeParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTypesConfig extends StObject {
  
  def getTypeParser[T](oid: Double): TypeParser[String, T | String]
  def getTypeParser[T](oid: TypeId): TypeParser[String, T | String]
  @JSName("getTypeParser")
  var getTypeParser_Original: FnCall
  @JSName("getTypeParser")
  def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String]
  @JSName("getTypeParser")
  def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String]
  @JSName("getTypeParser")
  def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String]
  @JSName("getTypeParser")
  def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String]
}
object CustomTypesConfig {
  
  inline def apply(getTypeParser: FnCall): CustomTypesConfig = {
    val __obj = js.Dynamic.literal(getTypeParser = getTypeParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTypesConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTypesConfig] (val x: Self) extends AnyVal {
    
    inline def setGetTypeParser(value: FnCall): Self = StObject.set(x, "getTypeParser", value.asInstanceOf[js.Any])
  }
}
