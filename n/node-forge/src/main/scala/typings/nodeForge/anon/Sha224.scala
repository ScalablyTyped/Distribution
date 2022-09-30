package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha512.AlgorithmSelection
import typings.nodeForge.mod.md.sha512.Sha384MessageDigest
import typings.nodeForge.mod.md.sha512.Sha512224MessageDigest
import typings.nodeForge.mod.md.sha512.Sha512256MessageDigest
import typings.nodeForge.mod.md.sha512.Sha512MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha224 extends StObject {
  
  def create[TAlg /* <: AlgorithmSelection */](): Sha512MessageDigest | Sha512256MessageDigest | Sha512224MessageDigest | Sha384MessageDigest = js.native
  def create[TAlg /* <: AlgorithmSelection */](/** @default 'SHA-512' */
  algorithm: TAlg): Sha512MessageDigest | Sha512256MessageDigest | Sha512224MessageDigest | Sha384MessageDigest = js.native
  
  var sha224: `1` = js.native
  
  var sha256: `2` = js.native
  
  var sha384: `3` = js.native
}
