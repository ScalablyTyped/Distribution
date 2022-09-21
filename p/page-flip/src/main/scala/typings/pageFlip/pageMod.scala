package typings.pageFlip

import typings.pageFlip.basicTypesMod.Point
import typings.pageFlip.renderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  @JSImport("page-flip/dist/Page/Page", "Page")
  @js.native
  abstract class Page protected () extends StObject {
    /* protected */ def this(render: Render, density: PageDensity) = this()
    
    /** Density at creation */
    /* protected */ var createdDensity: PageDensity = js.native
    
    /**
      * Render dynamic page, using state
      */
    def draw(): Unit = js.native
    def draw(tempDensity: PageDensity): Unit = js.native
    
    /**
      * Get a constant page density
      */
    def getDensity(): PageDensity = js.native
    
    /**
      * Get temp page density
      */
    def getDrawingDensity(): PageDensity = js.native
    
    /**
      * Get rotate angle for hard pages
      */
    def getHardAngle(): Double = js.native
    
    def getTemporaryCopy(): Page = js.native
    
    def hideTemporaryCopy(): Unit = js.native
    
    /**
      * Page loading
      */
    def load(): Unit = js.native
    
    def newTemporaryCopy(): Page = js.native
    
    /** Density at the time of rendering (Depends on neighboring pages) */
    /* protected */ var nowDrawingDensity: PageDensity = js.native
    
    /** Page Orientation */
    /* protected */ var orientation: PageOrientation = js.native
    
    /** Render object */
    /* protected */ var render: Render = js.native
    
    /**
      * Set page angle
      */
    def setAngle(angle: Double): Unit = js.native
    
    /**
      * Set page crop area
      */
    def setArea(area: js.Array[Point]): Unit = js.native
    
    /**
      * Set a constant page density
      */
    def setDensity(density: PageDensity): Unit = js.native
    
    /**
      * Set temp page density to next render
      */
    def setDrawingDensity(density: PageDensity): Unit = js.native
    
    /**
      * Rotate angle for hard pages
      */
    def setHardAngle(angle: Double): Unit = js.native
    
    /**
      * Rotate angle for hard pages to next render
      */
    def setHardDrawingAngle(angle: Double): Unit = js.native
    
    /**
      * Set page orientation
      */
    def setOrientation(orientation: PageOrientation): Unit = js.native
    
    /**
      * Set page position
      */
    def setPosition(pagePos: Point): Unit = js.native
    
    /**
      * Render static page
      */
    def simpleDraw(orient: PageOrientation): Unit = js.native
    
    /** State of the page on the basis of which rendering */
    /* protected */ var state: PageState = js.native
  }
  
  @js.native
  sealed trait PageDensity extends StObject
  @JSImport("page-flip/dist/Page/Page", "PageDensity")
  @js.native
  object PageDensity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PageDensity & String] = js.native
    
    @js.native
    sealed trait HARD
      extends StObject
         with PageDensity
    /* "hard" */ val HARD: typings.pageFlip.pageMod.PageDensity.HARD & String = js.native
    
    @js.native
    sealed trait SOFT
      extends StObject
         with PageDensity
    /* "soft" */ val SOFT: typings.pageFlip.pageMod.PageDensity.SOFT & String = js.native
  }
  
  @js.native
  sealed trait PageOrientation extends StObject
  @JSImport("page-flip/dist/Page/Page", "PageOrientation")
  @js.native
  object PageOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PageOrientation & Double] = js.native
    
    /** Left side page */
    @js.native
    sealed trait LEFT
      extends StObject
         with PageOrientation
    /* 0 */ val LEFT: typings.pageFlip.pageMod.PageOrientation.LEFT & Double = js.native
    
    /** Right side page */
    @js.native
    sealed trait RIGHT
      extends StObject
         with PageOrientation
    /* 1 */ val RIGHT: typings.pageFlip.pageMod.PageOrientation.RIGHT & Double = js.native
  }
  
  trait PageState extends StObject {
    
    /** Page rotation angle */
    var angle: Double
    
    /** Page scope */
    var area: js.Array[Point]
    
    /** Rotate angle for hard pages */
    var hardAngle: Double
    
    /** Rotate angle for hard pages at renedering time */
    var hardDrawingAngle: Double
    
    /** Page position */
    var position: Point
  }
  object PageState {
    
    inline def apply(angle: Double, area: js.Array[Point], hardAngle: Double, hardDrawingAngle: Double, position: Point): PageState = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], hardAngle = hardAngle.asInstanceOf[js.Any], hardDrawingAngle = hardDrawingAngle.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageState]
    }
    
    extension [Self <: PageState](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setArea(value: js.Array[Point]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaVarargs(value: Point*): Self = StObject.set(x, "area", js.Array(value*))
      
      inline def setHardAngle(value: Double): Self = StObject.set(x, "hardAngle", value.asInstanceOf[js.Any])
      
      inline def setHardDrawingAngle(value: Double): Self = StObject.set(x, "hardDrawingAngle", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
