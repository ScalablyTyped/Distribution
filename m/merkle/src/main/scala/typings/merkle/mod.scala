package typings.merkle

import typings.merkle.merkleStrings.md5
import typings.merkle.merkleStrings.none
import typings.merkle.merkleStrings.ripemd160
import typings.merkle.merkleStrings.sha1
import typings.merkle.merkleStrings.sha256
import typings.merkle.merkleStrings.sha512
import typings.merkle.merkleStrings.whirlpool
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: md5): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: md5, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: none): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: none, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: ripemd160): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: ripemd160, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha1): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha1, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha256): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha256, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha512): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: sha512, useUpperCaseForHash: Boolean): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: whirlpool): MerkleStream = js.native
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  def apply(hashname: whirlpool, useUpperCaseForHash: Boolean): MerkleStream = js.native
  
  @js.native
  trait MerkleStream extends Transform {
    
    def async(leaves: js.Array[_], callback: js.Function2[/* err */ String, /* tree */ MerkleTree, Unit]): Unit = js.native
    
    def json(): MerkleStream = js.native
    
    def sync(leaves: js.Array[_]): MerkleTree = js.native
  }
  
  @js.native
  trait MerkleTree extends StObject {
    
    def depth(): Double = js.native
    
    def level(level: Double): js.UndefOr[Double] = js.native
    
    def levels(): Double = js.native
    
    def nodes(): Double = js.native
    
    def root(): String = js.native
  }
  object MerkleTree {
    
    @scala.inline
    def apply(
      depth: () => Double,
      level: Double => js.UndefOr[Double],
      levels: () => Double,
      nodes: () => Double,
      root: () => String
    ): MerkleTree = {
      val __obj = js.Dynamic.literal(depth = js.Any.fromFunction0(depth), level = js.Any.fromFunction1(level), levels = js.Any.fromFunction0(levels), nodes = js.Any.fromFunction0(nodes), root = js.Any.fromFunction0(root))
      __obj.asInstanceOf[MerkleTree]
    }
    
    @scala.inline
    implicit class MerkleTreeMutableBuilder[Self <: MerkleTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: () => Double): Self = StObject.set(x, "depth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLevel(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLevels(value: () => Double): Self = StObject.set(x, "levels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNodes(value: () => Double): Self = StObject.set(x, "nodes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRoot(value: () => String): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
    }
  }
}
