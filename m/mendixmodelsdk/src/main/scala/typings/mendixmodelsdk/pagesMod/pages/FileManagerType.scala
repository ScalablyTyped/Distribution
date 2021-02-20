package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FileManagerType")
@js.native
class FileManagerType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FileManagerType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FileManagerType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FileManagerType.Both")
  @js.native
  def Both: FileManagerType = js.native
  @scala.inline
  def Both_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FileManagerType.Download")
  @js.native
  def Download: FileManagerType = js.native
  @scala.inline
  def Download_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Download")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FileManagerType.Upload")
  @js.native
  def Upload: FileManagerType = js.native
  @scala.inline
  def Upload_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Upload")(x.asInstanceOf[js.Any])
}
