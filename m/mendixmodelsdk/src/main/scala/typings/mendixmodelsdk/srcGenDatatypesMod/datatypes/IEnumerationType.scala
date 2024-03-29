package typings.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.IEnumeration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
@js.native
trait IEnumerationType
  extends StObject
     with IDataType {
  
  /**
    * This property is required and cannot be set to null.
    */
  val enumeration: IEnumeration = js.native
  
  val enumerationQualifiedName: String = js.native
}
