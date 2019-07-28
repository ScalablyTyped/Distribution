package typings.postmark.postmarkMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "AdminClient")
@js.native
class AdminClient protected () extends js.Object {
  def this(apiKey: String, options: Partial[Options]) = this()
  def createDomain(options: CreateDomain): js.UndefOr[scala.Nothing] = js.native
  def createDomain(options: CreateDomain, callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createDomain")
  def createDomain_Promise(options: CreateDomain): js.Promise[Domain] = js.native
  def createSenderSignature(options: CreateSignature): js.UndefOr[scala.Nothing] = js.native
  def createSenderSignature(options: CreateSignature, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createSenderSignature")
  def createSenderSignature_Promise(options: CreateSignature): js.Promise[SenderSignature] = js.native
  def createServer(options: CreateServer): js.UndefOr[scala.Nothing] = js.native
  def createServer(options: CreateServer, callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createServer")
  def createServer_Promise(options: CreateServer): js.Promise[Server] = js.native
  def deleteDomain(id: Double): js.UndefOr[scala.Nothing] = js.native
  def deleteDomain(id: Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteDomain")
  def deleteDomain_Promise(id: Double): js.Promise[GenericResult] = js.native
  def deleteSenderSignature(id: Double): js.UndefOr[scala.Nothing] = js.native
  def deleteSenderSignature(id: Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteSenderSignature")
  def deleteSenderSignature_Promise(id: Double): js.Promise[GenericResult] = js.native
  def deleteServer(id: Double): js.UndefOr[scala.Nothing] = js.native
  def deleteServer(id: Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteServer")
  def deleteServer_Promise(id: Double): js.Promise[GenericResult] = js.native
  def editDomain(id: Double, options: Partial[CreateDomain]): js.UndefOr[scala.Nothing] = js.native
  def editDomain(id: Double, options: Partial[CreateDomain], callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editDomain")
  def editDomain_Promise(id: Double, options: Partial[CreateDomain]): js.Promise[Domain] = js.native
  def editSenderSignature(id: Double, options: UpdateSignature): js.UndefOr[scala.Nothing] = js.native
  def editSenderSignature(id: Double, options: UpdateSignature, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editSenderSignature")
  def editSenderSignature_Promise(id: Double, options: UpdateSignature): js.Promise[SenderSignature] = js.native
  def editServer(id: Double, options: Partial[CreateServer]): js.UndefOr[scala.Nothing] = js.native
  def editServer(id: Double, options: Partial[CreateServer], callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editServer")
  def editServer_Promise(id: Double, options: Partial[CreateServer]): js.Promise[Server] = js.native
  def getDomain(id: Double): js.UndefOr[scala.Nothing] = js.native
  def getDomain(id: Double, callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getDomain")
  def getDomain_Promise(id: Double): js.Promise[Domain] = js.native
  def getServer(id: Double): js.UndefOr[scala.Nothing] = js.native
  def getServer(id: Double, callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  // servers
  @JSName("getServer")
  def getServer_Promise(id: Double): js.Promise[Server] = js.native
  def listDomains(query: Filter): js.UndefOr[scala.Nothing] = js.native
  def listDomains(query: Filter, callback: PostmarkCallback[DomainsResult]): js.UndefOr[scala.Nothing] = js.native
  // domains
  @JSName("listDomains")
  def listDomains_Promise(query: Filter): js.Promise[DomainsResult] = js.native
  def listSenderSignatures(query: Filter): js.UndefOr[scala.Nothing] = js.native
  def listSenderSignatures(query: Filter, callback: PostmarkCallback[SenderSignaturesResults]): js.UndefOr[scala.Nothing] = js.native
  @JSName("listSenderSignatures")
  def listSenderSignatures_Promise(query: Filter): js.Promise[SenderSignaturesResults] = js.native
  def listServers(query: ServerFilter): js.UndefOr[scala.Nothing] = js.native
  def listServers(query: ServerFilter, callback: PostmarkCallback[ServersResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("listServers")
  def listServers_Promise(query: ServerFilter): js.Promise[ServersResult] = js.native
  def requestNewDKIMForSenderSignature(id: Double): js.UndefOr[scala.Nothing] = js.native
  def requestNewDKIMForSenderSignature(id: Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("requestNewDKIMForSenderSignature")
  def requestNewDKIMForSenderSignature_Promise(id: Double): js.Promise[GenericResult] = js.native
  def resendSenderSignatureConfirmation(id: Double): js.UndefOr[scala.Nothing] = js.native
  def resendSenderSignatureConfirmation(id: Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("resendSenderSignatureConfirmation")
  def resendSenderSignatureConfirmation_Promise(id: Double): js.Promise[GenericResult] = js.native
  def rotateDKIMForDomain(id: Double): js.UndefOr[scala.Nothing] = js.native
  def rotateDKIMForDomain(id: Double, callback: PostmarkCallback[RotateDKIMResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("rotateDKIMForDomain")
  def rotateDKIMForDomain_Promise(id: Double): js.Promise[RotateDKIMResult] = js.native
  def verifyDomainSPF(id: Double): js.UndefOr[scala.Nothing] = js.native
  def verifyDomainSPF(id: Double, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("verifyDomainSPF")
  def verifyDomainSPF_Promise(id: Double): js.Promise[SenderSignature] = js.native
  def verifySenderSignatureSPF(id: Double): js.UndefOr[scala.Nothing] = js.native
  def verifySenderSignatureSPF(id: Double, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("verifySenderSignatureSPF")
  def verifySenderSignatureSPF_Promise(id: Double): js.Promise[SenderSignature] = js.native
}

