package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.buildTypesErrorsParserErrorMod.ParserError
import typings.peculiarJsonSchema.buildTypesSchemaMod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesErrorsKeyErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/key_error", "KeyError")
  @js.native
  open class KeyError protected () extends ParserError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
    
    var errors: IKeyErrors = js.native
    
    var keys: js.Array[String] = js.native
  }
  
  type IKeyErrors = StringDictionary[js.Error]
}
