package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PathFollower {
  
  /**
    * Settings for a PathFollower.
    */
  @js.native
  trait PathConfig extends StObject {
    
    /**
      * The duration of the path follow in ms. Must be `> 0`.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The start position of the path follow, between 0 and 1. Must be less than `to`.
      */
    var from: js.UndefOr[Double] = js.native
    
    /**
      * Whether to position the PathFollower on the Path using its path offset.
      */
    var positionOnPath: js.UndefOr[Boolean] = js.native
    
    /**
      * Should the PathFollower automatically rotate to point in the direction of the Path?
      */
    var rotateToPath: js.UndefOr[Boolean] = js.native
    
    /**
      * If the PathFollower is rotating to match the Path, this value is added to the rotation value. This allows you to rotate objects to a path but control the angle of the rotation as well.
      */
    var rotationOffset: js.UndefOr[Double] = js.native
    
    /**
      * Current start position of the path follow, must be between `from` and `to`.
      */
    var startAt: js.UndefOr[Double] = js.native
    
    /**
      * The end position of the path follow, between 0 and 1. Must be more than `from`.
      */
    var to: js.UndefOr[Double] = js.native
  }
  object PathConfig {
    
    @scala.inline
    def apply(): PathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfig]
    }
    
    @scala.inline
    implicit class PathConfigMutableBuilder[Self <: PathConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setPositionOnPath(value: Boolean): Self = StObject.set(x, "positionOnPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOnPathUndefined: Self = StObject.set(x, "positionOnPath", js.undefined)
      
      @scala.inline
      def setRotateToPath(value: Boolean): Self = StObject.set(x, "rotateToPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateToPathUndefined: Self = StObject.set(x, "rotateToPath", js.undefined)
      
      @scala.inline
      def setRotationOffset(value: Double): Self = StObject.set(x, "rotationOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationOffsetUndefined: Self = StObject.set(x, "rotationOffset", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
