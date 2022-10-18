package typings.pdfjsDist

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayAnnotationStorageMod {
  
  @JSImport("pdfjs-dist/types/src/display/annotation_storage", "AnnotationStorage")
  @js.native
  open class AnnotationStorage () extends StObject {
    
    var _modified: Boolean = js.native
    
    var _storage: Map[Any, Any] = js.native
    
    def getAll(): Any = js.native
    
    /**
      * Get the value for a given key.
      *
      * @public
      * @memberof AnnotationStorage
      * @param {string} key
      * @returns {Object}
      */
    def getRawValue(key: String): js.Object = js.native
    
    /**
      * Get the value for a given key if it exists, or return the default value.
      *
      * @public
      * @memberof AnnotationStorage
      * @param {string} key
      * @param {Object} defaultValue
      * @returns {Object}
      */
    def getValue(key: String, defaultValue: js.Object): js.Object = js.native
    
    /**
      * Check if the storage contains the given key.
      * @param {string} key
      * @returns {boolean}
      */
    def has(key: String): Boolean = js.native
    
    var onAnnotationEditor: Any = js.native
    
    var onResetModified: Any = js.native
    
    var onSetModified: Any = js.native
    
    /**
      * @returns {PrintAnnotationStorage}
      */
    def print: PrintAnnotationStorage = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Remove a value from the storage.
      * @param {string} key
      */
    def remove(key: String): Unit = js.native
    
    def resetModified(): Unit = js.native
    
    /**
      * PLEASE NOTE: Only intended for usage within the API itself.
      * @ignore
      */
    def serializable: (Map[Any, Any]) | Null = js.native
    
    /**
      * Set the value for a given key
      *
      * @public
      * @memberof AnnotationStorage
      * @param {string} key
      * @param {Object} value
      */
    def setValue(key: String, value: js.Object): Unit = js.native
    
    def size: Double = js.native
  }
  /* static members */
  object AnnotationStorage {
    
    @JSImport("pdfjs-dist/types/src/display/annotation_storage", "AnnotationStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * PLEASE NOTE: Only intended for usage within the API itself.
      * @ignore
      */
    inline def getHash(map: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(map.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("pdfjs-dist/types/src/display/annotation_storage", "PrintAnnotationStorage")
  @js.native
  open class PrintAnnotationStorage protected () extends AnnotationStorage {
    def this(parent: Any) = this()
  }
}
