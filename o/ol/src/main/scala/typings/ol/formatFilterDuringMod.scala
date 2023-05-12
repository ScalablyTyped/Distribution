package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterDuringMod {
  
  /**
    * @classdesc
    * Represents a `<During>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/During", JSImport.Default)
  @js.native
  open class default protected () extends During {
    /**
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!string} begin The begin date in ISO-8601 format.
      * @param {!string} end The end date in ISO-8601 format.
      */
    def this(propertyName: String, begin: String, end: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<During>` comparison operator.
    * @api
    */
  @js.native
  trait During
    extends typings.ol.formatFilterComparisonMod.default {
    
    /**
      * @type {!string}
      */
    var begin: String = js.native
    
    /**
      * @type {!string}
      */
    var end: String = js.native
  }
}
