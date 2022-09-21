package typings.nivoVoronoi

import typings.nivoVoronoi.typesMod.VoronoiLayerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nivoVoronoiStrings {
  
  @js.native
  sealed trait bounds
    extends StObject
       with VoronoiLayerId
  inline def bounds: bounds = "bounds".asInstanceOf[bounds]
  
  @js.native
  sealed trait cells
    extends StObject
       with VoronoiLayerId
  inline def cells: cells = "cells".asInstanceOf[cells]
  
  @js.native
  sealed trait links
    extends StObject
       with VoronoiLayerId
  inline def links: links = "links".asInstanceOf[links]
  
  @js.native
  sealed trait points
    extends StObject
       with VoronoiLayerId
  inline def points: points = "points".asInstanceOf[points]
}
