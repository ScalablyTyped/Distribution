package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType")
@js.native
open class RestOperationParameterType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RestOperationParameterType {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType.Body")
  @js.native
  def Body: RestOperationParameterType = js.native
  inline def Body_=(x: RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType.Form")
  @js.native
  def Form: RestOperationParameterType = js.native
  inline def Form_=(x: RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType.Header")
  @js.native
  def Header: RestOperationParameterType = js.native
  inline def Header_=(x: RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType.Path")
  @js.native
  def Path: RestOperationParameterType = js.native
  inline def Path_=(x: RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.RestOperationParameterType.Query")
  @js.native
  def Query: RestOperationParameterType = js.native
  inline def Query_=(x: RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Query")(x.asInstanceOf[js.Any])
}
