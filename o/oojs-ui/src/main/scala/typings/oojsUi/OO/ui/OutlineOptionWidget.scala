package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
import typings.oojsUi.OO.ui.OutlineOptionWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OutlineOptionWidget is an item in an {@link OO.ui.OutlineSelectWidget OutlineSelectWidget}.
  *
  * Currently, this class is only used by {@link OO.ui.BookletLayout booklet layouts}, which
  * contain {@link OO.ui.PageLayout page layouts}. See {@link OO.ui.BookletLayout BookletLayout}
  * for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.OutlineOptionWidget
  */
@js.native
trait OutlineOptionWidget
  extends StObject
     with Props
     with Prototype
object OutlineOptionWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.DecoratedOptionWidget.ConfigOptions {
    
    /** Indentation level */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Allow modification from {@link OO.ui.OutlineControlsWidget outline controls}. */
    var movable: js.UndefOr[Boolean] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[OutlineOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, OutlineOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype {
    
    /**
      * Get indentation level.
      *
      * @return Indentation level
      */
    def getLevel(): Double = js.native
    
    /**
      * Check if item is movable.
      *
      * Movability is used by {@link OO.ui.OutlineControlsWidget outline controls}.
      *
      * @return Item is movable
      */
    def isMovable(): Boolean = js.native
    
    /**
      * Check if item is removable.
      *
      * Removability is used by {@link OO.ui.OutlineControlsWidget outline controls}.
      *
      * @return Item is removable
      */
    def isRemovable(): Boolean = js.native
    
    /**
      * Set indentation level.
      *
      * @param level Indentation level, in the range of [0, maxLevel]
      * @return The widget, for chaining
      */
    def setLevel(): this.type = js.native
    def setLevel(level: Double): this.type = js.native
    
    /**
      * Set movability.
      *
      * Movability is used by {@link OO.ui.OutlineControlsWidget outline controls}.
      *
      * @param movable Item is movable
      * @return The widget, for chaining
      */
    def setMovable(movable: Boolean): this.type = js.native
    
    /**
      * Set removability.
      *
      * Removability is used by {@link OO.ui.OutlineControlsWidget outline controls}.
      *
      * @param removable Item is removable
      * @return The widget, for chaining
      */
    def setRemovable(removable: Boolean): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.DecoratedOptionWidget.Static {
    
    var levelClass: String = js.native
    
    var levels: Double = js.native
  }
}
