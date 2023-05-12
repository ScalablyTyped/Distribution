package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeBucketOpt extends StObject {
  
  var ObjectLocking: Boolean
}
object MakeBucketOpt {
  
  inline def apply(ObjectLocking: Boolean): MakeBucketOpt = {
    val __obj = js.Dynamic.literal(ObjectLocking = ObjectLocking.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeBucketOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakeBucketOpt] (val x: Self) extends AnyVal {
    
    inline def setObjectLocking(value: Boolean): Self = StObject.set(x, "ObjectLocking", value.asInstanceOf[js.Any])
  }
}
