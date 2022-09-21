package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convert incoming JSON data into a {@link StandardMaterial}.
  *
  * @ignore
  */
@JSImport("playcanvas", "JsonStandardMaterialParser")
@js.native
open class JsonStandardMaterialParser () extends StObject {
  
  def _validate(data: Any): Any = js.native
  
  var _validator: StandardMaterialValidator = js.native
  
  /**
    * Initialize material properties from the material data block e.g. Loading from server.
    *
    * @param {StandardMaterial} material - The material to be initialized.
    * @param {object} data - The data block that is used to initialize.
    */
  def initialize(material: StandardMaterial, data: js.Object): Unit = js.native
  
  def migrate(data: Any): Any = js.native
  
  def parse(input: Any): StandardMaterial = js.native
}
