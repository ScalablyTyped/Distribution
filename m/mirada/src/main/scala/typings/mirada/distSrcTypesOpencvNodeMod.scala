package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvNodeMod {
  
  @JSImport("mirada/dist/src/types/opencv/Node", "Node")
  @js.native
  open class Node () extends StObject {
    
    /**
      *   Class index normalized to 0..class_count-1 range and assigned to the node. It is used internally
      * in classification trees and tree ensembles.
      *
      */
    var classIdx: int = js.native
    
    /**
      *   Default direction where to go (-1: left or +1: right). It helps in the case of missing values.
      *
      */
    var defaultDir: int = js.native
    
    var left: int = js.native
    
    var parent: int = js.native
    
    var right: int = js.native
    
    var split: int = js.native
    
    /**
      *   Value at the node: a class label in case of classification or estimated function value in case of
      * regression.
      *
      */
    var value: double = js.native
  }
}
