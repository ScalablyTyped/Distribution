package typings.postmark

import typings.postmark.callbackMod.Callback
import typings.postmark.defaultResponseMod.DefaultResponse
import typings.postmark.domainMod.DomainDetails
import typings.postmark.domainMod.Domains
import typings.postmark.modelsMod.ClientOptions.Configuration
import typings.postmark.modelsMod.CreateDomainRequest
import typings.postmark.modelsMod.CreateServerRequest
import typings.postmark.modelsMod.CreateSignatureRequest
import typings.postmark.modelsMod.FilteringParameters
import typings.postmark.modelsMod.ServerFilteringParameters
import typings.postmark.modelsMod.TemplatesPushRequest
import typings.postmark.modelsMod.UpdateDomainRequest
import typings.postmark.modelsMod.UpdateServerRequest
import typings.postmark.modelsMod.UpdateSignatureRequest
import typings.postmark.serverMod.Server
import typings.postmark.serversMod.Servers
import typings.postmark.signatureMod.SignatureDetails
import typings.postmark.signatureMod.Signatures
import typings.postmark.templateMod.TemplatesPush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/AccountClient", JSImport.Namespace)
@js.native
object accountClientMod extends js.Object {
  
  @js.native
  trait AccountClient
    extends typings.postmark.baseClientMod.default {
    
    /**
      * Create a new Domain.
      *
      * @param options - The options to be used to create new Domain.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createDomain(options: CreateDomainRequest): js.Promise[DomainDetails] = js.native
    def createDomain(options: CreateDomainRequest, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Create a new Sender Signature.
      *
      * @param options - The options to be used to create new Sender Signature.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createSenderSignature(options: CreateSignatureRequest): js.Promise[SignatureDetails] = js.native
    def createSenderSignature(options: CreateSignatureRequest, callback: Callback[SignatureDetails]): js.Promise[SignatureDetails] = js.native
    
    /**
      * Create a new Server.
      *
      * @param options - The options to be used to create new Server.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createServer(options: CreateServerRequest): js.Promise[Server] = js.native
    def createServer(options: CreateServerRequest, callback: Callback[Server]): js.Promise[Server] = js.native
    
    /**
      * Delete a Domain.
      *
      * @param id - The ID of the Domain you wish to delete.
      * @param options - The options to be used in create Domain.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteDomain(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteDomain(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Delete a Domain.
      *
      * @param id - The ID of the Domain you wish to delete.
      * @param options - The options to be used in create Domain.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteSenderSignature(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteSenderSignature(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Modify the Server associated with this Client.
      *
      * @param id - The ID of the Domain you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteServer(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteServer(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Update a Domain.
      *
      * @param id - The ID of the Domain you wish to update.
      * @param domain - The values on the Domain you wish to update.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editDomain(id: Double, options: UpdateDomainRequest): js.Promise[DomainDetails] = js.native
    def editDomain(id: Double, options: UpdateDomainRequest, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Update a Sender Signature.
      *
      * @param id - The ID of the Sender Signature for which you wish to update.
      * @param options - The values on the Sender Signature you wish to update.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editSenderSignature(id: Double, options: UpdateSignatureRequest): js.Promise[SignatureDetails] = js.native
    def editSenderSignature(id: Double, options: UpdateSignatureRequest, callback: Callback[SignatureDetails]): js.Promise[SignatureDetails] = js.native
    
    /**
      * Modify the Server associated with this Client.
      *
      * @param id - The ID of the Server you wish to update.
      * @param options - The options to be used to create new Server.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editServer(id: Double, options: UpdateServerRequest): js.Promise[Server] = js.native
    def editServer(id: Double, options: UpdateServerRequest, callback: Callback[Server]): js.Promise[Server] = js.native
    
    /**
      * Retrieve a single Domain by ID.
      *
      * @param id - The ID of the Domain for which you wish to retrieve details.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getDomain(id: Double): js.Promise[DomainDetails] = js.native
    def getDomain(id: Double, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Retrieve a batch of Domains.
      *
      * @param filter - An optional filter for which data is retrieved.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getDomains(): js.Promise[Domains] = js.native
    def getDomains(filter: js.UndefOr[scala.Nothing], callback: Callback[Domains]): js.Promise[Domains] = js.native
    def getDomains(filter: FilteringParameters): js.Promise[Domains] = js.native
    def getDomains(filter: FilteringParameters, callback: Callback[Domains]): js.Promise[Domains] = js.native
    
    /**
      * Retrieve a single Sender Signature by ID.
      *
      * @param id - The ID of the Sender Signature for which you wish to retrieve details.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSenderSignature(id: Double): js.Promise[SignatureDetails] = js.native
    def getSenderSignature(id: Double, callback: Callback[SignatureDetails]): js.Promise[SignatureDetails] = js.native
    
    /**
      * Retrieve a batch of Sender Signatures.
      *
      * @param filter - An optional filter for which data is retrieved.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSenderSignatures(): js.Promise[Signatures] = js.native
    def getSenderSignatures(filter: js.UndefOr[scala.Nothing], callback: Callback[Signatures]): js.Promise[Signatures] = js.native
    def getSenderSignatures(filter: FilteringParameters): js.Promise[Signatures] = js.native
    def getSenderSignatures(filter: FilteringParameters, callback: Callback[Signatures]): js.Promise[Signatures] = js.native
    
    /**
      * Retrieve a single server by ID.
      *
      * @param id - The ID of the Server for which you wish to retrieve details.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getServer(id: Double): js.Promise[Server] = js.native
    def getServer(id: Double, callback: Callback[Server]): js.Promise[Server] = js.native
    
    /**
      * Retrieve a list of Servers.
      *
      * @param filter - An optional filter for which data is retrieved.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getServers(): js.Promise[Servers] = js.native
    def getServers(filter: js.UndefOr[scala.Nothing], callback: Callback[Servers]): js.Promise[Servers] = js.native
    def getServers(filter: ServerFilteringParameters): js.Promise[Servers] = js.native
    def getServers(filter: ServerFilteringParameters, callback: Callback[Servers]): js.Promise[Servers] = js.native
    
    /**
      * Request a push of templates from one server to another.
      *
      * @param options - details for pushing templates from one place to another.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def pushTemplates(options: TemplatesPushRequest): js.Promise[TemplatesPush] = js.native
    def pushTemplates(options: TemplatesPushRequest, callback: Callback[TemplatesPush]): js.Promise[TemplatesPush] = js.native
    
    /**
      * Request that the SPF records for Sender Signature be verified.
      *
      * @param id - The ID of the Sender Signature.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def requestNewDKIMForSenderSignature(id: Double): js.Promise[SignatureDetails] = js.native
    def requestNewDKIMForSenderSignature(id: Double, callback: Callback[SignatureDetails]): js.Promise[SignatureDetails] = js.native
    
    /**
      * Request a new confirmation email to be sent to the email address associated with a Sender Signature.
      *
      * @param id - The ID of the Sender Signature.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def resendSenderSignatureConfirmation(id: Double): js.Promise[DefaultResponse] = js.native
    def resendSenderSignatureConfirmation(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    
    /**
      * Trigger Domain DKIM key verification.
      *
      * @param id - The ID of the Domain you wish to trigger DKIM verification for.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def rotateDomainDKIM(id: Double): js.Promise[DomainDetails] = js.native
    def rotateDomainDKIM(id: Double, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Trigger Domain DKIM key verification.
      *
      * @param id - The ID of the Domain you wish to trigger DKIM verification for.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def verifyDomainDKIM(id: Double): js.Promise[DomainDetails] = js.native
    def verifyDomainDKIM(id: Double, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Trigger Domain DKIM key verification.
      *
      * @param id - The ID of the Domain you wish to trigger DKIM verification for.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def verifyDomainReturnPath(id: Double): js.Promise[DomainDetails] = js.native
    def verifyDomainReturnPath(id: Double, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Trigger Domain DKIM key verification.
      *
      * @param id - The ID of the Domain you wish to trigger DKIM verification for.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def verifyDomainSPF(id: Double): js.Promise[DomainDetails] = js.native
    def verifyDomainSPF(id: Double, callback: Callback[DomainDetails]): js.Promise[DomainDetails] = js.native
    
    /**
      * Request that the SPF records for Sender Signature be verified.
      *
      * @param id - The ID of the Sender Signature.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def verifySenderSignatureSPF(id: Double): js.Promise[SignatureDetails] = js.native
    def verifySenderSignatureSPF(id: Double, callback: Callback[SignatureDetails]): js.Promise[SignatureDetails] = js.native
  }
  
  @js.native
  class default protected () extends AccountClient {
    /**
      * Create a new AccountClient
      * @param accountToken The account token that should be used with requests.
      * @param configOptions Various options to customize client behavior.
      */
    def this(accountToken: String) = this()
    def this(accountToken: String, configOptions: Configuration) = this()
  }
}
