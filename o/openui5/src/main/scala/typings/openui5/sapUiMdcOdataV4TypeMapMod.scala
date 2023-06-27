package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcOdataV4TypeMapMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/odata/v4/TypeMap", JSImport.Default)
  @js.native
  val default: TypeMap = js.native
  
  /**
    * @since 1.114.0
    *
    * ODataV4-specific `TypeMap` configuration
    *
    * **Note:** This `TypeMap` implementation contains the following types including ODataV4-specific configuration:
    *
    *
    * 	 - sap.ui.model.type.Boolean (alias Boolean)
    * 	 - sap.ui.model.type.Currency (alias Currency)
    * 	 - sap.ui.model.type.Date (alias Date)
    * 	 - sap.ui.model.type.DateTime (alias DateTime)
    * 	 - sap.ui.model.type.Float (alias Float)
    * 	 - sap.ui.model.type.Integer (alias Integer)
    * 	 - sap.ui.model.type.String (alias String)
    * 	 - sap.ui.model.type.Time (alias Time)
    * 	 - sap.ui.model.type.Unit (alias Unit)
    * 	 - sap.ui.model.odata.type.Stream (alias Edm.Binary)
    * 	 - sap.ui.model.odata.type.Boolean (alias Edm.Boolean)
    * 	 - sap.ui.model.odata.type.Byte (alias Edm.Byte)
    * 	 - sap.ui.model.odata.type.Date (alias Edm.Date)
    * 	 - sap.ui.model.odata.type.DateTime (alias Edm.DateTime)
    * 	 - sap.ui.model.odata.type.DateTimeOffset (alias Edm.DateTimeOffset)
    * 	 - sap.ui.model.odata.type.Decimal (alias Edm.Decimal)
    * 	 - sap.ui.model.odata.type.Double (alias Edm.Double)
    * 	 - sap.ui.model.odata.type.Single (alias Edm.Float)
    * 	 - sap.ui.model.odata.type.Guid (alias Edm.Guid)
    * 	 - sap.ui.model.odata.type.Int16 (alias Edm.Int16)
    * 	 - sap.ui.model.odata.type.Int32 (alias Edm.Int32)
    * 	 - sap.ui.model.odata.type.Int64 (alias Edm.Int64)
    * 	 - sap.ui.model.odata.type.SByte (alias Edm.SByte)
    * 	 - sap.ui.model.odata.type.Single (alias Edm.Single)
    * 	 - sap.ui.model.odata.type.Stream (alias Edm.Stream)
    * 	 - sap.ui.model.odata.type.String (alias Edm.String)
    * 	 - sap.ui.model.odata.type.Time (alias Edm.Time)
    * 	 - sap.ui.model.odata.type.TimeOfDay (alias Edm.TimeOfDay)
    */
  trait TypeMap extends StObject
  
  type _To = TypeMap
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcOdataV4TypeMapMod.foo` */
  override def _to: TypeMap = default
}
