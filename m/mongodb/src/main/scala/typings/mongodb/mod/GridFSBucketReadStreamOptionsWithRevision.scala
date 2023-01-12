package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketReadStreamOptionsWithRevision
  extends StObject
     with GridFSBucketReadStreamOptions {
  
  /** The revision number relative to the oldest file with the given filename. 0
    * gets you the oldest file, 1 gets you the 2nd oldest, -1 gets you the
    * newest. */
  var revision: js.UndefOr[scala.Double] = js.undefined
}
object GridFSBucketReadStreamOptionsWithRevision {
  
  inline def apply(): GridFSBucketReadStreamOptionsWithRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketReadStreamOptionsWithRevision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFSBucketReadStreamOptionsWithRevision] (val x: Self) extends AnyVal {
    
    inline def setRevision(value: scala.Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
