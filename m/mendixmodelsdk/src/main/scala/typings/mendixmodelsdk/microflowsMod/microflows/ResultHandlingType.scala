package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType")
@js.native
open class ResultHandlingType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ResultHandlingType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType.FileDocument")
  @js.native
  def FileDocument: ResultHandlingType = js.native
  inline def FileDocument_=(x: ResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileDocument")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType.HttpResponse")
  @js.native
  def HttpResponse: ResultHandlingType = js.native
  inline def HttpResponse_=(x: ResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpResponse")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType.Mapping")
  @js.native
  def Mapping: ResultHandlingType = js.native
  inline def Mapping_=(x: ResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mapping")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType.None")
  @js.native
  def None: ResultHandlingType = js.native
  inline def None_=(x: ResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandlingType.String")
  @js.native
  def String: ResultHandlingType = js.native
  inline def String_=(x: ResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
}
