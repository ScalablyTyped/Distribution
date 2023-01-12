package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.Attribute
import typings.postcssSelectorParser.anon.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOptions
  extends StObject
     with NamespaceOptions[js.UndefOr[String]] {
  
  var attribute: String
  
  var insensitive: js.UndefOr[Boolean] = js.undefined
  
  var operator: js.UndefOr[AttributeOperator] = js.undefined
  
  var quoteMark: js.UndefOr[QuoteMark] = js.undefined
  
  /** @deprecated Use quoteMark instead. */
  var quoted: js.UndefOr[Boolean] = js.undefined
  
  var raws: Operator
  
  @JSName("spaces")
  var spaces_AttributeOptions: js.UndefOr[Attribute] = js.undefined
}
object AttributeOptions {
  
  inline def apply(attribute: String, raws: Operator): AttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], raws = raws.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
    
    inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
    
    inline def setOperator(value: AttributeOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setQuoteMark(value: QuoteMark): Self = StObject.set(x, "quoteMark", value.asInstanceOf[js.Any])
    
    inline def setQuoteMarkNull: Self = StObject.set(x, "quoteMark", null)
    
    inline def setQuoteMarkUndefined: Self = StObject.set(x, "quoteMark", js.undefined)
    
    inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    inline def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
    
    inline def setRaws(value: Operator): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setSpaces(value: Attribute): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
  }
}
