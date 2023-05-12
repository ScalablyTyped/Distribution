package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterIsLikeMod {
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLike>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/IsLike", JSImport.Default)
  @js.native
  open class default protected () extends IsLike {
    /**
      * [constructor description]
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!string} pattern Text pattern.
      * @param {string} [wildCard] Pattern character which matches any sequence of
      *    zero or more string characters. Default is '*'.
      * @param {string} [singleChar] pattern character which matches any single
      *    string character. Default is '.'.
      * @param {string} [escapeChar] Escape character which can be used to escape
      *    the pattern characters. Default is '!'.
      * @param {boolean} [matchCase] Case-sensitive?
      */
    def this(propertyName: String, pattern: String) = this()
    def this(propertyName: String, pattern: String, wildCard: String) = this()
    def this(propertyName: String, pattern: String, wildCard: String, singleChar: String) = this()
    def this(propertyName: String, pattern: String, wildCard: Unit, singleChar: String) = this()
    def this(propertyName: String, pattern: String, wildCard: String, singleChar: String, escapeChar: String) = this()
    def this(propertyName: String, pattern: String, wildCard: String, singleChar: Unit, escapeChar: String) = this()
    def this(propertyName: String, pattern: String, wildCard: Unit, singleChar: String, escapeChar: String) = this()
    def this(propertyName: String, pattern: String, wildCard: Unit, singleChar: Unit, escapeChar: String) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: String,
      singleChar: String,
      escapeChar: String,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: String,
      singleChar: String,
      escapeChar: Unit,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: String,
      singleChar: Unit,
      escapeChar: String,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: String,
      singleChar: Unit,
      escapeChar: Unit,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: Unit,
      singleChar: String,
      escapeChar: String,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: Unit,
      singleChar: String,
      escapeChar: Unit,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: Unit,
      singleChar: Unit,
      escapeChar: String,
      matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      wildCard: Unit,
      singleChar: Unit,
      escapeChar: Unit,
      matchCase: Boolean
    ) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLike>` comparison operator.
    * @api
    */
  @js.native
  trait IsLike
    extends typings.ol.formatFilterComparisonMod.default {
    
    /**
      * @type {!string}
      */
    var escapeChar: String = js.native
    
    /**
      * @type {boolean|undefined}
      */
    var matchCase: js.UndefOr[Boolean] = js.native
    
    /**
      * @type {!string}
      */
    var pattern: String = js.native
    
    /**
      * @type {!string}
      */
    var singleChar: String = js.native
    
    /**
      * @type {!string}
      */
    var wildCard: String = js.native
  }
}
