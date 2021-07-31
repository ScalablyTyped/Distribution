package typings.postmanCollection.anon

import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Any extends StObject {
  
  var any: Out
  
  def boolean[T](): Boolean
  def boolean[T](value: T): Boolean
  @JSName("boolean")
  var boolean_Original: BooleanConstructor
  
  var json: In
  
  def number(): Double
  def number(value: js.Any): Double
  @JSName("number")
  var number_Original: NumberConstructor
  
  def string(): String
  def string(value: js.Any): String
  @JSName("string")
  var string_Original: StringConstructor
}
object Any {
  
  @scala.inline
  def apply(
    any: Out,
    boolean: BooleanConstructor,
    json: In,
    number: NumberConstructor,
    string: StringConstructor
  ): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  
  @scala.inline
  implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: Out): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: BooleanConstructor): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: In): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: NumberConstructor): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: StringConstructor): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
