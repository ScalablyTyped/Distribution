package typings.pdfjsDist.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PDF document and page is built of many objects. E.g. there are objects for
  * fonts, images, rendering code, etc. These objects may get processed inside of
  * a worker. This class implements some basic methods to manage these objects.
  */
@js.native
trait PDFObjects extends StObject {
  
  def clear(): Unit = js.native
  
  /**
    * If called *without* callback, this returns the data of `objId` but the
    * object needs to be resolved. If it isn't, this method throws.
    *
    * If called *with* a callback, the callback is called with the data of the
    * object once the object is resolved. That means, if you call this method
    * and the object is already resolved, the callback gets called right away.
    *
    * @param {string} objId
    * @param {function} [callback]
    * @returns {any}
    */
  def get(objId: String): Any = js.native
  def get(objId: String, callback: js.Function): Any = js.native
  
  /**
    * @param {string} objId
    * @returns {boolean}
    */
  def has(objId: String): Boolean = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Resolves the object `objId` with optional `data`.
    *
    * @param {string} objId
    * @param {any} [data]
    */
  def resolve(objId: String): Unit = js.native
  def resolve(objId: String, data: Any): Unit = js.native
}
