package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk", "AbstractElement")
@js.native
open class AbstractElement[TModel /* <: IAbstractModel */, TContainer /* <: Container */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[TModel, TContainer] {
  def this(
    model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}
