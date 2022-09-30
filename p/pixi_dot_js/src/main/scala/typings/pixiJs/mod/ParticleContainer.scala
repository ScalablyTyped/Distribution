package typings.pixiJs.mod

import typings.pixiParticleContainer.mod.IParticleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ParticleContainer")
@js.native
/**
  * @param maxSize - The maximum number of particles that can be rendered by the container.
  *  Affects size of allocated buffers.
  * @param properties - The properties of children that should be uploaded to the gpu and applied.
  * @param {boolean} [properties.vertices=false] - When true, vertices be uploaded and applied.
  *                  if sprite's ` scale/anchor/trim/frame/orig` is dynamic, please set `true`.
  * @param {boolean} [properties.position=true] - When true, position be uploaded and applied.
  * @param {boolean} [properties.rotation=false] - When true, rotation be uploaded and applied.
  * @param {boolean} [properties.uvs=false] - When true, uvs be uploaded and applied.
  * @param {boolean} [properties.tint=false] - When true, alpha and tint be uploaded and applied.
  * @param {number} [batchSize=16384] - Number of particles per batch. If less than maxSize, it uses maxSize instead.
  * @param {boolean} [autoResize=false] - If true, container allocates more batches in case
  *  there are more than `maxSize` particles.
  */
open class ParticleContainer ()
  extends typings.pixiParticleContainer.mod.ParticleContainer {
  def this(maxSize: Double) = this()
  def this(maxSize: Double, properties: IParticleProperties) = this()
  def this(maxSize: Unit, properties: IParticleProperties) = this()
  def this(maxSize: Double, properties: Unit, batchSize: Double) = this()
  def this(maxSize: Double, properties: IParticleProperties, batchSize: Double) = this()
  def this(maxSize: Unit, properties: Unit, batchSize: Double) = this()
  def this(maxSize: Unit, properties: IParticleProperties, batchSize: Double) = this()
  def this(maxSize: Double, properties: Unit, batchSize: Double, autoResize: Boolean) = this()
  def this(maxSize: Double, properties: Unit, batchSize: Unit, autoResize: Boolean) = this()
  def this(maxSize: Double, properties: IParticleProperties, batchSize: Double, autoResize: Boolean) = this()
  def this(maxSize: Double, properties: IParticleProperties, batchSize: Unit, autoResize: Boolean) = this()
  def this(maxSize: Unit, properties: Unit, batchSize: Double, autoResize: Boolean) = this()
  def this(maxSize: Unit, properties: Unit, batchSize: Unit, autoResize: Boolean) = this()
  def this(maxSize: Unit, properties: IParticleProperties, batchSize: Double, autoResize: Boolean) = this()
  def this(maxSize: Unit, properties: IParticleProperties, batchSize: Unit, autoResize: Boolean) = this()
}
