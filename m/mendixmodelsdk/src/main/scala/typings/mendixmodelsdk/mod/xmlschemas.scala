package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlschemas {
  
  @JSImport("mendixmodelsdk", "xmlschemas.MxSchema")
  @js.native
  abstract class MxSchema protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.MxSchema {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MxSchema {
    
    @JSImport("mendixmodelsdk", "xmlschemas.MxSchema")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.MxSchema.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.MxSchema.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "xmlschemas.XmlElement")
  @js.native
  class XmlElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XmlElement {
    
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType")
  @js.native
  class XmlPrimitiveType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlPrimitiveType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object XmlPrimitiveType {
    
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.AnyType")
    @js.native
    def AnyType: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def AnyType_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Binary")
    @js.native
    def Binary: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Binary_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Boolean_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Date")
    @js.native
    def Date: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.DateTime")
    @js.native
    def DateTime: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def DateTime_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Date_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Decimal_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Float")
    @js.native
    def Float: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Float_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Integer_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Long")
    @js.native
    def Long: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Long_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.String")
    @js.native
    def String: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def String_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Time")
    @js.native
    def Time: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Time_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlPrimitiveType.Unknown")
    @js.native
    def Unknown: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    @scala.inline
    def Unknown_=(x: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "xmlschemas.XmlSchema")
  @js.native
  class XmlSchema protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchema {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object XmlSchema {
    
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchema")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchema.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchema.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchema.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry")
  @js.native
  class XmlSchemaEntry protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchemaEntry {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XmlSchemaEntry {
    
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry.createInWsdlDescriptionUnderSchemaEntries")
    @js.native
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry.createInXmlSchemaUnderEntries")
    @js.native
    def createInXmlSchemaUnderEntries(container: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "xmlschemas.XmlSchemaEntry.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
