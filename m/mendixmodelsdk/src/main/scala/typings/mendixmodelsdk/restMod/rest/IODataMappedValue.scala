package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
@js.native
trait IODataMappedValue
  extends StObject
     with IMappedValue {
  
  /**
    * In version 8.16.0: introduced
    */
  val filterable: Boolean = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  val representsStream: Boolean = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  val sortable: Boolean = js.native
}
