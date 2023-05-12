package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterFilterMod {
  
  /**
    * @module ol/format/filter/Filter
    */
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature filters.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/Filter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Filter {
    /**
      * @param {!string} tagName The XML tag name for this filter.
      */
    def this(tagName: String) = this()
    
    /**
      * The XML tag name for a filter.
      * @return {!string} Name.
      */
    /* CompleteClass */
    override def getTagName(): String = js.native
    
    /**
      * @private
      * @type {!string}
      */
    /* private */ /* CompleteClass */
    var tagName_ : Any = js.native
  }
  
  /**
    * @module ol/format/filter/Filter
    */
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature filters.
    *
    * @abstract
    */
  trait Filter extends StObject {
    
    /**
      * The XML tag name for a filter.
      * @return {!string} Name.
      */
    def getTagName(): String
    
    /**
      * @private
      * @type {!string}
      */
    /* private */ var tagName_ : Any
  }
  object Filter {
    
    inline def apply(getTagName: () => String, tagName_ : Any): Filter = {
      val __obj = js.Dynamic.literal(getTagName = js.Any.fromFunction0(getTagName), tagName_ = tagName_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setGetTagName(value: () => String): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setTagName_(value: Any): Self = StObject.set(x, "tagName_", value.asInstanceOf[js.Any])
    }
  }
}
