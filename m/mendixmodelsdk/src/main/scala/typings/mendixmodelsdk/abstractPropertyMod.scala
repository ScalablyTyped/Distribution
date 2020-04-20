package typings.mendixmodelsdk

import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.utilsMod.utils.IMap
import typings.mendixmodelsdk.versionChecksMod.PropertyVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/AbstractProperty", JSImport.Namespace)
@js.native
object abstractPropertyMod extends js.Object {
  @js.native
  abstract class AbstractProperty[T, P] protected () extends js.Object {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(declaredOn: IStructureClass, parent: Structure, name: String, initialValue: T, moreArgs: js.Any*) = this()
    var declaredOn: IStructureClass = js.native
    var disposer: js.UndefOr[js.Function0[Unit]] = js.native
    val isAvailable: Boolean = js.native
    val isPublic: Boolean = js.native
    val isRequired: Boolean = js.native
    var name: String = js.native
    var observableValue: P = js.native
    var parent: Structure = js.native
    def deepCopyInto(
      clone: Structure,
      idMap: IMap[Structure],
      unresolvedIdentifierFixers: js.Array[js.Function1[/* idMap */ IMap[Structure], Unit]]
    ): Unit = js.native
    def dispose(): Unit = js.native
    def get(): T = js.native
    def reportAvailabilityIssues(): Unit = js.native
    def updateWithRawValue(value: js.Any): Unit = js.native
    def versionInfo: PropertyVersionInfo = js.native
  }
  
}

