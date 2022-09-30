package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.FileManagerType")
@js.native
open class FileManagerType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.FileManagerType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FileManagerType {
  
  @JSImport("mendixmodelsdk", "pages.FileManagerType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FileManagerType.Both")
  @js.native
  def Both: typings.mendixmodelsdk.pagesMod.pages.FileManagerType = js.native
  inline def Both_=(x: typings.mendixmodelsdk.pagesMod.pages.FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FileManagerType.Download")
  @js.native
  def Download: typings.mendixmodelsdk.pagesMod.pages.FileManagerType = js.native
  inline def Download_=(x: typings.mendixmodelsdk.pagesMod.pages.FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Download")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FileManagerType.Upload")
  @js.native
  def Upload: typings.mendixmodelsdk.pagesMod.pages.FileManagerType = js.native
  inline def Upload_=(x: typings.mendixmodelsdk.pagesMod.pages.FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Upload")(x.asInstanceOf[js.Any])
}
