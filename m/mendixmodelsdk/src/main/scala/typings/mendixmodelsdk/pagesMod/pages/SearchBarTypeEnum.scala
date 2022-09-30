package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum")
@js.native
open class SearchBarTypeEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SearchBarTypeEnum {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum.AlwaysOpen")
  @js.native
  def AlwaysOpen: SearchBarTypeEnum = js.native
  inline def AlwaysOpen_=(x: SearchBarTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlwaysOpen")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum.FoldableClosed")
  @js.native
  def FoldableClosed: SearchBarTypeEnum = js.native
  inline def FoldableClosed_=(x: SearchBarTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FoldableClosed")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum.FoldableOpen")
  @js.native
  def FoldableOpen: SearchBarTypeEnum = js.native
  inline def FoldableOpen_=(x: SearchBarTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FoldableOpen")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchBarTypeEnum.None")
  @js.native
  def None: SearchBarTypeEnum = js.native
  inline def None_=(x: SearchBarTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
