package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variants extends StObject {
  
  var defaultProps: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsProps * / any['MUIDataTableBodyCell'] */ js.Any
  ] = js.undefined
  
  var styleOverrides: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsOverrides * / any['MUIDataTableBodyCell'] */ js.Any
  ] = js.undefined
  
  var variants: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsVariants * / any['MUIDataTableBodyCell'] */ js.Any
  ] = js.undefined
}
object Variants {
  
  inline def apply(): Variants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Variants] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsProps * / any['MUIDataTableBodyCell'] */ js.Any
    ): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsOverrides * / any['MUIDataTableBodyCell'] */ js.Any
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentsVariants * / any['MUIDataTableBodyCell'] */ js.Any
    ): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
