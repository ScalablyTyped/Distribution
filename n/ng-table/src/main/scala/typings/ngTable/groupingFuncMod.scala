package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupingFuncMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngTable.ngTableStrings._empty
    - typings.ngTable.ngTableStrings.asc
    - typings.ngTable.ngTableStrings.desc
  */
  trait GroupSort extends StObject
  object GroupSort {
    
    inline def _empty: typings.ngTable.ngTableStrings._empty = "".asInstanceOf[typings.ngTable.ngTableStrings._empty]
    
    inline def asc: typings.ngTable.ngTableStrings.asc = "asc".asInstanceOf[typings.ngTable.ngTableStrings.asc]
    
    inline def desc: typings.ngTable.ngTableStrings.desc = "desc".asInstanceOf[typings.ngTable.ngTableStrings.desc]
  }
  
  type Grouping[T] = IGroupValues | IGroupingFunc[T]
  
  type IGroupValues = StringDictionary[GroupSort]
  
  @js.native
  trait IGroupingFunc[T] extends StObject {
    
    def apply(item: T): String = js.native
    
    /**
      * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
      */
    var sortDirection: js.UndefOr[GroupSort] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
}
