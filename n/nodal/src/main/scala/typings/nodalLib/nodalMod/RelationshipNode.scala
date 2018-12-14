package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipNode")
@js.native
class RelationshipNode protected () extends js.Object {
  def this(Graph: RelationshipGraph, mModel: org.scalablytyped.runtime.Instantiable3[
      /* modelData */ js.Object, 
      /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
      /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
      Model
    ]) = this()
  var Graph: RelationshipGraph = js.native
  var Model: org.scalablytyped.runtime.Instantiable3[
    /* modelData */ js.Object, 
    /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
    /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
    Model
  ] = js.native
  var edges: js.Array[RelationshipEdge] = js.native
  def cascade(): js.Array[RelationshipPath] = js.native
  def childEdges(): js.Array[RelationshipEdge] = js.native
  def find(name: java.lang.String): RelationshipPath | scala.Null = js.native
  def findExplicit(pathname: java.lang.String): RelationshipPath | scala.Null = js.native
  def joinsTo(
    mModel: org.scalablytyped.runtime.Instantiable3[
      /* modelData */ js.Object, 
      /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
      /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
      Model
    ],
    options: IOptions
  ): RelationshipEdge | scala.Null = js.native
}

