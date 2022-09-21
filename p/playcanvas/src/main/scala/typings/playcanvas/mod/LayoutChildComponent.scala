package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').LayoutChildComponentSystem} LayoutChildComponentSystem */
/**
  * A LayoutChildComponent enables the Entity to control the sizing applied to it by its parent
  * {@link LayoutGroupComponent}.
  *
  * @augments Component
  */
@JSImport("playcanvas", "LayoutChildComponent")
@js.native
open class LayoutChildComponent protected () extends Component {
  /**
    * Create a new LayoutChildComponent.
    *
    * @param {LayoutChildComponentSystem} system - The ComponentSystem that created this
    * Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: LayoutChildComponentSystem, entity: Entity) = this()
  
  /** @private */
  /* private */ var _excludeFromLayout: Any = js.native
  
  /** @private */
  /* private */ var _fitHeightProportion: Any = js.native
  
  /** @private */
  /* private */ var _fitWidthProportion: Any = js.native
  
  /** @private */
  /* private */ var _maxHeight: Any = js.native
  
  /** @private */
  /* private */ var _maxWidth: Any = js.native
  
  /** @private */
  /* private */ var _minHeight: Any = js.native
  
  /** @private */
  /* private */ var _minWidth: Any = js.native
  
  def excludeFromLayout: Boolean = js.native
  /**
    * If set to true, the child will be excluded from all layout calculations.
    *
    * @type {boolean}
    */
  def excludeFromLayout_=(arg: Boolean): Unit = js.native
  
  def fitHeightProportion: Double = js.native
  /**
    * The amount of additional vertical space that the element should take up, if necessary to
    * satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into
    * account the proportion values of other siblings.
    *
    * @type {number}
    */
  def fitHeightProportion_=(arg: Double): Unit = js.native
  
  def fitWidthProportion: Double = js.native
  /**
    * The amount of additional horizontal space that the element should take up, if necessary to
    * satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into
    * account the proportion values of other siblings.
    *
    * @type {number}
    */
  def fitWidthProportion_=(arg: Double): Unit = js.native
  
  def maxHeight: Any = js.native
  /**
    * The maximum height the element should be rendered at.
    *
    * @type {number|null}
    */
  def maxHeight_=(arg: Any): Unit = js.native
  
  def maxWidth: Any = js.native
  /**
    * The maximum width the element should be rendered at.
    *
    * @type {number|null}
    */
  def maxWidth_=(arg: Any): Unit = js.native
  
  def minHeight: Double = js.native
  /**
    * The minimum height the element should be rendered at.
    *
    * @type {number}
    */
  def minHeight_=(arg: Double): Unit = js.native
  
  def minWidth: Double = js.native
  /**
    * The minimum width the element should be rendered at.
    *
    * @type {number}
    */
  def minWidth_=(arg: Double): Unit = js.native
}
