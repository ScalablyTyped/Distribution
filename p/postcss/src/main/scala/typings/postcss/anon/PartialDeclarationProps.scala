package typings.postcss.anon

import typings.postcss.libDeclarationMod.DeclarationRaws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postcss.postcss/lib/declaration.DeclarationProps> */
trait PartialDeclarationProps extends StObject {
  
  var important: js.UndefOr[Boolean] = js.undefined
  
  var prop: js.UndefOr[String] = js.undefined
  
  var raws: js.UndefOr[DeclarationRaws] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PartialDeclarationProps {
  
  inline def apply(): PartialDeclarationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDeclarationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDeclarationProps] (val x: Self) extends AnyVal {
    
    inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    inline def setRaws(value: DeclarationRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
