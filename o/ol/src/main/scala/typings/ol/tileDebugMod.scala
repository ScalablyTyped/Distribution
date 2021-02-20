package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileDebugMod {
  
  @JSImport("ol/source/TileDebug", JSImport.Default)
  @js.native
  class default () extends TileDebug {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait LabeledTile
    extends typings.ol.olTileMod.default {
    
    /**
      * Get the image element for this tile.
      */
    def getImage(): HTMLCanvasElement = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      @scala.inline
      def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  @js.native
  trait TileDebug
    extends typings.ol.xyzMod.default {
    
    def getTile(z: Double, x: Double, y: Double): LabeledTile = js.native
  }
}
