package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MatterJS")
@js.native
object MatterJS extends js.Object {
  /**
    * The `Matter.Bodies` module contains factory methods for creating rigid body models 
    * with commonly used body configurations (such as rectangles, circles and other polygons).
    */
  @js.native
  class Bodies () extends js.Object
  
  /**
    * The `Matter.Body` module contains methods for creating and manipulating body models.
    * A `Matter.Body` is a rigid body that can be simulated by a `Matter.Engine`.
    * Factories for commonly used body configurations (such as rectangles, circles and other polygons) can be found in the module `Matter.Bodies`.
    */
  @js.native
  class Body () extends js.Object
  
  /**
    * The `Matter.Composite` module contains methods for creating and manipulating composite bodies.
    * A composite body is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`, therefore composites form a tree structure.
    * It is important to use the functions in this module to modify composites, rather than directly modifying their properties.
    * Note that the `Matter.World` object is also a type of `Matter.Composite` and as such all composite methods here can also operate on a `Matter.World`.
    */
  @js.native
  class Composite () extends js.Object
  
  /**
    * The `Matter.Constraint` module contains methods for creating and manipulating constraints.
    * Constraints are used for specifying that a fixed distance must be maintained between two bodies (or a body and a fixed world-space position).
    * The stiffness of constraints can be modified to create springs or elastic.
    */
  @js.native
  class Constraint () extends js.Object
  
  /**
    * The `Matter.Engine` module contains methods for creating and manipulating engines.
    * An engine is a controller that manages updating the simulation of the world.
    */
  @js.native
  class Engine () extends js.Object
  
  /**
    * The `Matter.Vertices` module contains methods for creating and manipulating sets of vertices.
    * A set of vertices is an array of `Matter.Vector` with additional indexing properties inserted by `Vertices.create`.
    * A `Matter.Body` maintains a set of vertices to represent the shape of the object (its convex hull).
    */
  @js.native
  class Vertices () extends js.Object
  
  /**
    * The `Matter.World` module contains methods for creating and manipulating the world composite.
    * A `Matter.World` is a `Matter.Composite` body, which is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`.
    * A `Matter.World` has a few additional properties including `gravity` and `bounds`.
    * It is important to use the functions in the `Matter.Composite` module to modify the world composite, rather than directly modifying its properties.
    * There are also a few methods here that alias those in `Matter.Composite` for easier readability.
    */
  @js.native
  class World () extends Composite
  
}

