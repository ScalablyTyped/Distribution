package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IQueryBasedRemoteEntitySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
@js.native
trait IODataRemoteEntitySource
  extends StObject
     with IQueryBasedRemoteEntitySource {
  
  /**
    * In version 8.16.0: introduced
    */
  val countable: Boolean = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  val key: IODataKey | Null = js.native
}
