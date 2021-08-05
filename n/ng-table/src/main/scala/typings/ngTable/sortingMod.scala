package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortingMod {
  
  type ISortingValues = StringDictionary[SortDirection]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngTable.ngTableStrings.asc
    - typings.ngTable.ngTableStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    inline def asc: typings.ngTable.ngTableStrings.asc = "asc".asInstanceOf[typings.ngTable.ngTableStrings.asc]
    
    inline def desc: typings.ngTable.ngTableStrings.desc = "desc".asInstanceOf[typings.ngTable.ngTableStrings.desc]
  }
}
