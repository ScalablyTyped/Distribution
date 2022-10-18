package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.PropertyVersionInfo
import typings.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesAbstractPropertyMod {
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/properties/AbstractProperty", "AbstractProperty")
  @js.native
  open class AbstractProperty[T, P] protected () extends StObject {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    
    var declaredOn: IStructureClass = js.native
    
    def deepCopyInto(
      clone: Structure[IAbstractModel, IContainer | Null],
      idMap: IMap[Structure[IAbstractModel, IContainer | Null]],
      unresolvedIdentifierFixers: js.Array[
          js.Function1[/* idMap */ IMap[Structure[IAbstractModel, IContainer | Null]], Unit]
        ]
    ): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var disposer: js.UndefOr[js.Function0[Unit]] = js.native
    
    def get(): T = js.native
    
    val isAvailable: Boolean = js.native
    
    val isPublic: Boolean = js.native
    
    val isRequired: Boolean = js.native
    
    var name: String = js.native
    
    var observableValue: P = js.native
    
    var parent: Structure[IAbstractModel, IContainer | Null] = js.native
    
    def reportAvailabilityIssues(): Unit = js.native
    
    def updateWithRawValue(value: Any): Unit = js.native
    
    def versionInfo: PropertyVersionInfo = js.native
  }
}
