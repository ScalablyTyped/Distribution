package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoneTimeline extends StObject {
  
  /** The index of the bone in {@link Skeleton#bones} that will be changed. */
  var boneIndex: Double
}
object BoneTimeline {
  
  inline def apply(boneIndex: Double): BoneTimeline = {
    val __obj = js.Dynamic.literal(boneIndex = boneIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoneTimeline]
  }
  
  extension [Self <: BoneTimeline](x: Self) {
    
    inline def setBoneIndex(value: Double): Self = StObject.set(x, "boneIndex", value.asInstanceOf[js.Any])
  }
}
