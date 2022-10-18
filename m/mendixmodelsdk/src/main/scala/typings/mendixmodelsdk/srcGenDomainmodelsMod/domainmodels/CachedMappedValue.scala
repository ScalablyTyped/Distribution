package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.2: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IValueType because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMappedValue because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ICachedMappedValue because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CachedMappedValue")
@js.native
open class CachedMappedValue protected () extends MappedValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MCachedMappedValue: Attribute = js.native
}
object CachedMappedValue {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CachedMappedValue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CachedMappedValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CachedMappedValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
