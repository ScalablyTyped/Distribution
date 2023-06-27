package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcDefaultTypeMapMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/DefaultTypeMap", JSImport.Default)
  @js.native
  val default: DefaultTypeMap = js.native
  
  /**
    * @since 1.114.0
    *
    * Generic `TypeMap` configuration for simplistic usecases
    *
    * **Note:** This `TypeMap` implementation contains the following types:
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
    */
  trait DefaultTypeMap extends StObject
  
  type _To = DefaultTypeMap
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcDefaultTypeMapMod.foo` */
  override def _to: DefaultTypeMap = default
}
