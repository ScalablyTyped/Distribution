package typings.pico8parse.mod.ast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region node type aliases
/* Rewritten from type alias, can be one of: 
  - typings.pico8parse.mod.ast.StringLiteral
  - typings.pico8parse.mod.ast.NumericLiteral
  - typings.pico8parse.mod.ast.BooleanLiteral
  - typings.pico8parse.mod.ast.NilLiteral
  - typings.pico8parse.mod.ast.VarargLiteral
*/
trait Literal_
  extends StObject
     with Expression
object Literal_ {
  
  inline def BooleanLiteral(raw: String, value: Boolean): typings.pico8parse.mod.ast.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.BooleanLiteral]
  }
  
  inline def NilLiteral(raw: String, value: Null): typings.pico8parse.mod.ast.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NilLiteral")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.NilLiteral]
  }
  
  inline def NumericLiteral(raw: String, value: Double): typings.pico8parse.mod.ast.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.NumericLiteral]
  }
  
  inline def StringLiteral(raw: String, value: String): typings.pico8parse.mod.ast.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.StringLiteral]
  }
  
  inline def VarargLiteral(raw: String, value: String): typings.pico8parse.mod.ast.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VarargLiteral")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.VarargLiteral]
  }
}
