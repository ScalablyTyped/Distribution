package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationHeaderDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationHeaderDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationHeaderDef {
    
    /* CompleteClass */
    var complement: String = js.native
    
    /* CompleteClass */
    var filtersDisplay: String = js.native
    
    /* CompleteClass */
    var showDateTime: Boolean = js.native
    
    /* CompleteClass */
    var showEnterpriseName: Boolean = js.native
    
    /* CompleteClass */
    var showUserAndDatabaseName: Boolean = js.native
    
    /* CompleteClass */
    var useTagsAsLiterals: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationHeaderDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VisualizationHeaderDef extends StObject {
    
    var complement: String
    
    var filtersDisplay: String
    
    var showDateTime: Boolean
    
    var showEnterpriseName: Boolean
    
    var showUserAndDatabaseName: Boolean
    
    var useTagsAsLiterals: Boolean
  }
  object VisualizationHeaderDef {
    
    inline def apply(
      complement: String,
      filtersDisplay: String,
      showDateTime: Boolean,
      showEnterpriseName: Boolean,
      showUserAndDatabaseName: Boolean,
      useTagsAsLiterals: Boolean
    ): VisualizationHeaderDef = {
      val __obj = js.Dynamic.literal(complement = complement.asInstanceOf[js.Any], filtersDisplay = filtersDisplay.asInstanceOf[js.Any], showDateTime = showDateTime.asInstanceOf[js.Any], showEnterpriseName = showEnterpriseName.asInstanceOf[js.Any], showUserAndDatabaseName = showUserAndDatabaseName.asInstanceOf[js.Any], useTagsAsLiterals = useTagsAsLiterals.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualizationHeaderDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisualizationHeaderDef] (val x: Self) extends AnyVal {
      
      inline def setComplement(value: String): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      inline def setFiltersDisplay(value: String): Self = StObject.set(x, "filtersDisplay", value.asInstanceOf[js.Any])
      
      inline def setShowDateTime(value: Boolean): Self = StObject.set(x, "showDateTime", value.asInstanceOf[js.Any])
      
      inline def setShowEnterpriseName(value: Boolean): Self = StObject.set(x, "showEnterpriseName", value.asInstanceOf[js.Any])
      
      inline def setShowUserAndDatabaseName(value: Boolean): Self = StObject.set(x, "showUserAndDatabaseName", value.asInstanceOf[js.Any])
      
      inline def setUseTagsAsLiterals(value: Boolean): Self = StObject.set(x, "useTagsAsLiterals", value.asInstanceOf[js.Any])
    }
  }
}
