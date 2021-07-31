package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMicroflowParameterBase
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsMicroflow: IMicroflow = js.native
  
  val containerAsRule: IRule = js.native
  
  @JSName("model")
  val model_IMicroflowParameterBase: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  val parameterType: IDataType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  val `type`: String | Null = js.native
}
